
PN = "vulkan-loader"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-loader vulkan-loader-devel"


URI_vulkan-loader = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-loader-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-loader = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) mesa-vulkan-drivers(x86-64) ( )"
RPROVIDES:vulkan-loader = "libvulkan.so.1()(64bit) ( ) vulkan-loader(x86-64) ( =  1.4.304.0-1.el10) vulkan ( =  1.4.304.0-1.el10) vulkan(x86-64) ( =  1.4.304.0-1.el10) vulkan-filesystem ( =  1.4.304.0-1.el10) vulkan-loader ( =  1.4.304.0-1.el10)"

URI_vulkan-loader-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-loader-devel-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-loader-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) libvulkan.so.1()(64bit) ( ) vulkan-headers ( ) vulkan-loader(x86-64) ( =  1.4.304.0-1.el10)"
RPROVIDES:vulkan-loader-devel = "cmake(VulkanLoader) ( =  1.4.304) cmake(vulkanloader) ( =  1.4.304) pkgconfig(vulkan) ( =  1.4.304) vulkan-devel ( =  1.4.304.0-1.el10) vulkan-devel(x86-64) ( =  1.4.304.0-1.el10) vulkan-loader-devel ( =  1.4.304.0-1.el10) vulkan-loader-devel(x86-64) ( =  1.4.304.0-1.el10)"
