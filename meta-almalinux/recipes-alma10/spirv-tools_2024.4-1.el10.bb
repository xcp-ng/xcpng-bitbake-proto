
PN = "spirv-tools"
PE = "0"
PV = "2024.4"
PR = "1.el10"
PACKAGES = "spirv-tools spirv-tools-libs spirv-tools-devel"


URI_spirv-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spirv-tools-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spirv-tools = "
 glibc
 spirv-tools-libs
 libstdc++
 bash
"

URI_spirv-tools-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/spirv-tools-libs-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spirv-tools-libs = "
 glibc
 libstdc++
"

URI_spirv-tools-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/spirv-tools-devel-2024.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:spirv-tools-devel = "
 spirv-tools-libs
 cmake-filesystem
 pkgconf-pkg-config
"
