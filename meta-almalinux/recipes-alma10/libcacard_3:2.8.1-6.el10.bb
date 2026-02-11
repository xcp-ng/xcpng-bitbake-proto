
inherit dnf-bridge

PN = "libcacard"
PE = "3"
PV = "2.8.1"
PR = "6.el10"
PACKAGES = "libcacard libcacard-devel"


URI_libcacard = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcacard-2.8.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcacard = " \
 nss \
 pcsc-lite-libs \
 glib2 \
 glibc \
 nspr \
"

URI_libcacard-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcacard-devel-2.8.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcacard-devel = " \
 glib2-devel \
 libcacard \
 nss-devel \
 pkgconf-pkg-config \
 pcsc-lite-devel \
"
