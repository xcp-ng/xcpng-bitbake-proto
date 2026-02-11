
PN = "attr"
PE = "0"
PV = "2.5.2"
PR = "5.el10"
PACKAGES = "attr libattr libattr-devel"


URI_attr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/attr-2.5.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:attr = " \
 glibc \
 libattr \
"

URI_libattr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libattr-2.5.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libattr = " \
 glibc \
"

URI_libattr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libattr-devel-2.5.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libattr-devel = " \
 glibc-devel \
 pkgconf-pkg-config \
 libattr \
"
