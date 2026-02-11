
inherit dnf-bridge

PN = "autofs"
PE = "1"
PV = "5.1.9"
PR = "11.el10"
PACKAGES = "autofs"


URI_autofs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/autofs-5.1.9-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:autofs = " \
 systemd \
 systemd-libs \
 kmod \
 libgcc \
 gawk \
 grep \
 libxml2 \
 krb5-libs \
 cyrus-sasl-lib \
 libcom_err \
 bash \
 libtirpc \
 procps-ng \
 glibc \
 coreutils \
 sed \
 openldap \
"
