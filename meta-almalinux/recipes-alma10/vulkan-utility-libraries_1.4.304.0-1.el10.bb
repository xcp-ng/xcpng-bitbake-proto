
PN = "vulkan-utility-libraries"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-utility-libraries-devel"


URI_vulkan-utility-libraries-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/vulkan-utility-libraries-devel-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-utility-libraries-devel = "cmake-filesystem(x86-64) ( ) vulkan-headers ( )"
RPROVIDES:vulkan-utility-libraries-devel = "cmake(VulkanUtilityLibraries) ( ) cmake(vulkanutilitylibraries) ( ) vulkan-utility-libraries-devel ( =  1.4.304.0-1.el10) vulkan-utility-libraries-devel(x86-64) ( =  1.4.304.0-1.el10) vulkan-validation-layers-devel ( =  1.4.304.0-1.el10) vulkan-validation-layers-devel(x86-64) ( =  1.4.304.0-1.el10)"
