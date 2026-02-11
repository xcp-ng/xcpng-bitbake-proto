
inherit dnf-bridge

PN = "cifs-utils"
PE = "0"
PV = "7.2"
PR = "0.el10_0.1"
PACKAGES = "cifs-utils pam_cifscreds cifs-utils-devel cifs-utils-info"


URI_cifs-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/cifs-utils-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cifs-utils = " \
 libwbclient \
 keyutils-libs \
 keyutils \
 libcap-ng \
 krb5-libs \
 bash \
 libtalloc \
 glibc \
 alternatives \
"

URI_pam_cifscreds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pam_cifscreds-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:pam_cifscreds = " \
 glibc \
 keyutils-libs \
 pam-libs \
 libtalloc \
"

URI_cifs-utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/cifs-utils-devel-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cifs-utils-devel = ""

URI_cifs-utils-info = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cifs-utils-info-7.2-0.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:cifs-utils-info = " \
 python3 \
 cifs-utils \
"
