import { mount } from '@vue/test-utils'
import AboutMe from '@/views/AboutMe.vue'
import AboutMeDetails from "@/components/AboutMeDetails";

describe('Testing AboutMe.vue', () => {
    it('should have AboutMeDetails component', () => {
        // when
        const wrapper = mount(AboutMe)

        // then
        const cardList = wrapper.findComponent(AboutMeDetails)
        expect(cardList.exists()).toBeTruthy()
    })

})
