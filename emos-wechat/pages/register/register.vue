<template>
	<view>
		<image src="../../static/logo-2.png" mode="widthFix" class="logo"></image>
		<view class="register-container">
			<input type="text" placeholder="输入你的邀请码" class="register-code" 
			maxlength="6" v-model="registerCode"/>
		<view class="register-desc">管理员创建员工证账号之后，你可以从你的个人邮箱中获得注册邀请码</view>
		<button class="register-btn" open-type="getUserInfo" @tap="register()">执行注册</button>
		</view>
	</view>
</template>
 
<script>
	export default {
		data() {
			return {
				registerCode: null
			};
		},
		methods: {
			register:function(){
				uni.login({
					provider:"weixin",
					success:function(resp){
						//console.log(resp.code);
						let code =resp.code;
						//获取用户信息
					uni.getUserInfo({
						provider:"weixin",
						success:function(resp){
							//console.log(resp.userInfo.nickName);
							//console.log(resp.userInfo.avatarUrl);
							let nickname = resp.userInfo.nickName;//昵称
							let avatarUrl = resp.userInfo.avatarUrl;//头像
							
						}
					})
				}
			})
			}
		}
	};
</script>

<style lang="less">
	@import url('register.less');
</style>
