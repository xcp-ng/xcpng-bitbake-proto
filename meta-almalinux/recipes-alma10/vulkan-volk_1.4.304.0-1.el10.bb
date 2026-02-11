
PN = "vulkan-volk"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-volk-devel"


URI_vulkan-volk-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-volk-devel-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-volk-devel = "cmake-filesystem(x86-64) ( ) vulkan-headers ( )"
RPROVIDES:vulkan-volk-devel = "cmake(volk) ( =  304) vulkan-volk-devel ( =  1.4.304.0-1.el10) vulkan-volk-devel(x86-64) ( =  1.4.304.0-1.el10) vulkan-volk-static ( =  1.4.304.0-1.el10)"
