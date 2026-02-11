
inherit dnf-bridge

PN = "opensm"
PE = "0"
PV = "3.3.24"
PR = "12.el10"
PACKAGES = "opensm opensm-libs opensm-devel opensm-static"


URI_opensm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensm-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm = " \
 logrotate \
 systemd \
 opensm-libs \
 rdma-core \
 bash \
 glibc \
"

URI_opensm-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/opensm-libs-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm-libs = " \
 glibc \
 libibumad \
 libgcc \
"

URI_opensm-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/opensm-devel-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm-devel = " \
 opensm-libs \
"

URI_opensm-static = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/opensm-static-3.3.24-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opensm-static = " \
 opensm-devel \
"
