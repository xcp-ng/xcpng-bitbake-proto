
inherit dnf-bridge

PN = "shaderc"
PE = "0"
PV = "2024.4"
PR = "1.el10"
PACKAGES = "glslc libshaderc libshaderc-devel libshaderc-static"


URI_glslc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/glslc-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:glslc = " \
 glibc \
 spirv-tools-libs \
 libgcc \
 libstdc++ \
"

URI_libshaderc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libshaderc-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshaderc = " \
 glibc \
 spirv-tools-libs \
 libgcc \
 libstdc++ \
"

URI_libshaderc-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libshaderc-devel-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshaderc-devel = " \
 libshaderc \
 pkgconf-pkg-config \
"

URI_libshaderc-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libshaderc-static-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libshaderc-static = " \
 pkgconf-pkg-config \
"
