
inherit dnf-bridge

PN = "gtest"
PE = "0"
PV = "1.14.0"
PR = "5.el10"
PACKAGES = "gmock gmock-devel gtest gtest-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/gtest-1.14.0-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_gmock = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gmock-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gmock}"
RDEPENDS:gmock = " \
 glibc \
 libgcc \
 libstdc++ \
 gtest \
"

URI_gmock-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gmock-devel-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gmock-devel}"
RDEPENDS:gmock-devel = " \
 gmock \
 pkgconf-pkg-config \
 gtest-devel \
"

URI_gtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtest-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gtest}"
RDEPENDS:gtest = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_gtest-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtest-devel-1.14.0-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_gtest-devel}"
RDEPENDS:gtest-devel = " \
 gmock \
 cmake-filesystem \
 pkgconf-pkg-config \
 gtest \
"
