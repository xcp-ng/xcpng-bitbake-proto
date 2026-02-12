
inherit dnf-bridge

PN = "libssh"
PE = "0"
PV = "0.11.1"
PR = "4.el10_0"
PACKAGES = "libssh libssh-config libssh-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libssh-0.11.1-4.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libssh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libssh-0.11.1-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libssh}"
RDEPENDS:libssh = " \
 zlib-ng-compat \
 libssh-config \
 openssl-libs \
 krb5-libs \
 glibc \
"

URI_libssh-config = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libssh-config-0.11.1-4.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_libssh-config}"
RDEPENDS:libssh-config = ""

URI_libssh-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libssh-devel-0.11.1-4.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libssh-devel}"
RDEPENDS:libssh-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
 libssh \
"
