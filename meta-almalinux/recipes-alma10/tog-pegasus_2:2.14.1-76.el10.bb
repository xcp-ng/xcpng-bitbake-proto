
inherit dnf-bridge

PN = "tog-pegasus"
PE = "2"
PV = "2.14.1"
PR = "76.el10"
PACKAGES = "tog-pegasus tog-pegasus-libs tog-pegasus-devel tog-pegasus-test"


URI_tog-pegasus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tog-pegasus-2.14.1-76.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tog-pegasus = " \
 net-snmp-libs \
 ca-certificates \
 libxcrypt \
 openssl \
 libgcc \
 policycoreutils \
 tog-pegasus-libs \
 libstdc++ \
 bash \
 glibc \
"

URI_tog-pegasus-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tog-pegasus-libs-2.14.1-76.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tog-pegasus-libs = " \
 shadow-utils \
 net-snmp-libs \
 libxcrypt \
 libgcc \
 openssl-libs \
 openslp \
 pam-libs \
 libstdc++ \
 bash \
 glibc \
"

URI_tog-pegasus-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tog-pegasus-devel-2.14.1-76.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tog-pegasus-devel = " \
 tog-pegasus \
 bash \
"

URI_tog-pegasus-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tog-pegasus-test-2.14.1-76.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tog-pegasus-test = " \
 net-snmp-libs \
 libxcrypt \
 libgcc \
 make \
 tog-pegasus \
 tog-pegasus-libs \
 libstdc++ \
 glibc \
"
