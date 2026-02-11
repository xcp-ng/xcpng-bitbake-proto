
inherit dnf-bridge

PN = "tpm2-abrmd"
PE = "0"
PV = "3.0.0"
PR = "7.el10"
PACKAGES = "tpm2-abrmd tpm2-abrmd-devel"


URI_tpm2-abrmd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tpm2-abrmd-3.0.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-abrmd = " \
 systemd \
 bash \
 glib2 \
 tpm2-tss \
 glibc \
 tpm2-abrmd-selinux \
"

URI_tpm2-abrmd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/tpm2-abrmd-devel-3.0.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tpm2-abrmd-devel = " \
 tpm2-abrmd \
 glib2-devel \
 tpm2-tss-devel \
 pkgconf-pkg-config \
"
