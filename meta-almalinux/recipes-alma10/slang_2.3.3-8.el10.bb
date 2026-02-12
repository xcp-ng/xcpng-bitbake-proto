
inherit dnf-bridge

PN = "slang"
PE = "0"
PV = "2.3.3"
PR = "8.el10"
PACKAGES = "slang slang-devel slang-slsh"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/slang-2.3.3-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_slang = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/slang-2.3.3-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_slang}"
RDEPENDS:slang = " \
 glibc \
"

URI_slang-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slang-devel-2.3.3-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_slang-devel}"
RDEPENDS:slang-devel = " \
 slang \
 pkgconf-pkg-config \
"

URI_slang-slsh = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/slang-slsh-2.3.3-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_slang-slsh}"
RDEPENDS:slang-slsh = " \
 glibc \
 slang \
 zlib-ng-compat \
 libpng \
"
