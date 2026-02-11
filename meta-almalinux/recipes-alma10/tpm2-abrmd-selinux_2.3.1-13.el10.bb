
PN = "tpm2-abrmd-selinux"
PE = "0"
PV = "2.3.1"
PR = "13.el10"
PACKAGES = "tpm2-abrmd-selinux"


URI_tpm2-abrmd-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-abrmd-selinux-2.3.1-13.el10.noarch.rpm;unpack=0"
RDEPENDS:tpm2-abrmd-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
"
