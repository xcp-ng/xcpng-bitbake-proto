
inherit dnf-bridge

PN = "unbound"
PE = "0"
PV = "1.20.0"
PR = "12.el10_0"
PACKAGES = "python3-unbound unbound unbound-anchor unbound-dracut unbound-libs unbound-devel unbound-utils"


URI_python3-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-unbound-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-unbound = " \
 python3 \
 systemd-libs \
 libevent \
 openssl-libs \
 python3-libs \
 unbound-libs \
 libnghttp2 \
 glibc \
 protobuf-c \
"

URI_unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound = " \
 systemd-libs \
 libevent \
 openssl \
 unbound-anchor \
 openssl-libs \
 python3-libs \
 unbound-libs \
 bash \
 libnghttp2 \
 glibc \
 protobuf-c \
"

URI_unbound-anchor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-anchor-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-anchor = " \
 openssl-libs \
 unbound-libs \
 bash \
 expat \
 glibc \
"

URI_unbound-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-dracut-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-dracut = " \
 bash \
 dracut \
 unbound \
"

URI_unbound-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/unbound-libs-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-libs = " \
 shadow-utils \
 systemd-libs \
 libevent \
 openssl-libs \
 python3-libs \
 bash \
 libnghttp2 \
 glibc \
 protobuf-c \
"

URI_unbound-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/unbound-devel-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-devel = " \
 pkgconf-pkg-config \
 unbound-libs \
 openssl-devel \
 libevent-devel \
 python3-devel \
"

URI_unbound-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/unbound-utils-1.20.0-12.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:unbound-utils = " \
 libevent \
 openssl-libs \
 python3-libs \
 unbound-libs \
 libnghttp2 \
 glibc \
"
