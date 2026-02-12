
inherit dnf-bridge

PN = "glslang"
PE = "0"
PV = "15.1.0"
PR = "1.el10"
PACKAGES = "glslang glslang-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/glslang-15.1.0-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_glslang = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glslang-15.1.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glslang}"
RDEPENDS:glslang = " \
 glibc \
 spirv-tools-libs \
 libstdc++ \
"

URI_glslang-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/glslang-devel-15.1.0-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_glslang-devel}"
RDEPENDS:glslang-devel = " \
 glslang \
 cmake-filesystem \
 pkgconf-pkg-config \
"
