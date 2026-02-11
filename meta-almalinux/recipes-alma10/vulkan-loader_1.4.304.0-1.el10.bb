
PN = "vulkan-loader"
PE = "0"
PV = "1.4.304.0"
PR = "1.el10"
PACKAGES = "vulkan-loader vulkan-loader-devel"


URI_vulkan-loader = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-loader-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-loader = "
 glibc
 mesa-vulkan-drivers
"

URI_vulkan-loader-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vulkan-loader-devel-1.4.304.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vulkan-loader-devel = "
 vulkan-headers
 vulkan-loader
 cmake-filesystem
 pkgconf-pkg-config
"
