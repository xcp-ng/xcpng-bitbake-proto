
inherit dnf-bridge

PN = "xxhash"
PE = "0"
PV = "0.8.2"
PR = "4.el10"
PACKAGES = "xxhash xxhash-devel xxhash-doc xxhash-libs"


URI_xxhash = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-0.8.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxhash = " \
 glibc \
"

URI_xxhash-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-devel-0.8.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxhash-devel = " \
 xxhash-libs \
 pkgconf-pkg-config \
"

URI_xxhash-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-doc-0.8.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:xxhash-doc = ""

URI_xxhash-libs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xxhash-libs-0.8.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxhash-libs = " \
 glibc \
"
