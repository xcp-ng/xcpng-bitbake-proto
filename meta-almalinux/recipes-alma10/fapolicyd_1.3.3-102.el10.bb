
inherit dnf-bridge

PN = "fapolicyd"
PE = "0"
PV = "1.3.3"
PR = "102.el10"
PACKAGES = "fapolicyd fapolicyd-selinux"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/fapolicyd-1.3.3-102.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_fapolicyd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fapolicyd-1.3.3-102.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_fapolicyd}"
RDEPENDS:fapolicyd = " \
 shadow-utils \
 systemd \
 systemd-libs \
 lmdb-libs \
 rpm-plugin-fapolicyd \
 openssl-libs \
 libcap-ng \
 bash \
 libseccomp \
 glibc \
 file-libs \
 rpm-libs \
"

URI_fapolicyd-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fapolicyd-selinux-1.3.3-102.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_fapolicyd-selinux}"
RDEPENDS:fapolicyd-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 fapolicyd \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"
