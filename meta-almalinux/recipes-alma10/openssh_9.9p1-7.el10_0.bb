
inherit dnf-bridge

PN = "openssh"
PE = "0"
PV = "9.9p1"
PR = "7.el10_0"
PACKAGES = "openssh openssh-clients openssh-keycat openssh-server openssh-askpass openssh-keysign openssh-sk-dummy"


URI_openssh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh = " \
 util-linux \
 audit-libs \
 openssl-libs \
 glibc \
 libselinux \
"

URI_openssh-clients = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-clients-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-clients = " \
 zlib-ng-compat \
 openssh \
 crypto-policies \
 libfido2 \
 openssl-libs \
 krb5-libs \
 bash \
 glibc \
 libselinux \
 libedit \
"

URI_openssh-keycat = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-keycat-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-keycat = " \
 glibc \
 pam-libs \
 openssh \
"

URI_openssh-server = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/openssh-server-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-server = " \
 shadow-utils \
 systemd \
 zlib-ng-compat \
 openssh \
 crypto-policies \
 libxcrypt \
 audit-libs \
 openssl-libs \
 pam \
 pam-libs \
 krb5-libs \
 libcom_err \
 bash \
 glibc \
 libselinux \
"

URI_openssh-askpass = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openssh-askpass-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-askpass = " \
 glibc \
 openssh \
 glib2 \
 gtk3 \
"

URI_openssh-keysign = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openssh-keysign-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-keysign = " \
 glibc \
 openssl-libs \
 zlib-ng-compat \
 openssh \
"

URI_openssh-sk-dummy = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openssh-sk-dummy-9.9p1-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:openssh-sk-dummy = " \
 glibc \
 openssl-libs \
 openssh \
"
