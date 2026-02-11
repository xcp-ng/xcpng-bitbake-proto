
inherit dnf-bridge

PN = "libsigc++20"
PE = "0"
PV = "2.12.1"
PR = "3.el10"
PACKAGES = "libsigc++20 libsigc++20-devel libsigc++20-doc"


URI_libsigc++20 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsigc++20-2.12.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsigc++20 = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_libsigc++20-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsigc++20-devel-2.12.1-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libsigc++20-devel = " \
 libsigc++20 \
 pkgconf-pkg-config \
"

URI_libsigc++20-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libsigc++20-doc-2.12.1-3.el10.noarch.rpm;unpack=0"
RDEPENDS:libsigc++20-doc = " \
 libsigc++20 \
"
