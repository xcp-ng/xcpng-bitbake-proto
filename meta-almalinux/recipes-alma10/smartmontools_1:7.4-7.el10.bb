
inherit dnf-bridge

PN = "smartmontools"
PE = "1"
PV = "7.4"
PR = "7.el10"
PACKAGES = "smartmontools smartmontools-selinux"


URI_smartmontools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/smartmontools-7.4-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:smartmontools = " \
 systemd-libs \
 smartmontools-selinux \
 libgcc \
 libcap-ng \
 libstdc++ \
 bash \
 glibc \
 libselinux \
"

URI_smartmontools-selinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/smartmontools-selinux-7.4-7.el10.noarch.rpm;unpack=0"
RDEPENDS:smartmontools-selinux = " \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"
