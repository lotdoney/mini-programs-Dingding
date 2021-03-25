<template>
	<view>
		<view> {{username}} </view>
		<view v-for="one in tel">{{one}}</view>
		<view v-if="age>=18">
		<button @tap="signUp()">我要报名</button>
		</view>
		<view> 
		<input type="text" v-model="address"  placeholder="输入地址"/>
		</view>
		<view> {{address}}</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				username:"Doney",
				tel:['1223423424','1231564342'],
				age:23,
				address:""
			}
		},
		methods: {
			signUp:function(){
				uni.showToast({
					title:"点击了报名按钮"
				})
			}
		}
	}
</script>

<style>

</style>
