
PN = "spirv-headers"
PE = "0"
PV = "1.5.5"
PR = "24.el10"
PACKAGES = "spirv-headers-devel"


URI_spirv-headers-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/spirv-headers-devel-1.5.5-24.el10.noarch.rpm;unpack=0"
RDEPENDS:spirv-headers-devel = "/usr/bin/pkg-config ( ) cmake-filesystem ( )"
RPROVIDES:spirv-headers-devel = "cmake(SPIRV-Headers) ( =  1.5.5) cmake(spirv-headers) ( =  1.5.5) pkgconfig(SPIRV-Headers) ( =  1.5.5) spirv-headers-devel ( =  1.5.5-24.el10)"
