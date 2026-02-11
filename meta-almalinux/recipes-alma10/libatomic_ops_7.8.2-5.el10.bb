
inherit dnf-bridge

PN = "libatomic_ops"
PE = "0"
PV = "7.8.2"
PR = "5.el10"
PACKAGES = "libatomic_ops libatomic_ops-devel libatomic_ops-static"


URI_libatomic_ops = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libatomic_ops-7.8.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic_ops = " \
 glibc \
"

URI_libatomic_ops-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libatomic_ops-devel-7.8.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic_ops-devel = " \
 libatomic_ops \
 pkgconf-pkg-config \
"

URI_libatomic_ops-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libatomic_ops-static-7.8.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libatomic_ops-static = " \
 libatomic_ops-devel \
"
