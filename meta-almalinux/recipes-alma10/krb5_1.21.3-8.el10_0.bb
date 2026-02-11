
inherit dnf-bridge

PN = "krb5"
PE = "0"
PV = "1.21.3"
PR = "8.el10_0"
PACKAGES = "krb5-libs krb5-pkinit krb5-server krb5-server-ldap krb5-workstation libkadm5 krb5-devel krb5-tests"


URI_krb5-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/krb5-libs-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-libs = " \
 libverto \
 crypto-policies \
 keyutils-libs \
 openssl-libs \
 gawk \
 libselinux \
 libcom_err \
 glibc \
 coreutils \
 sed \
"

URI_krb5-pkinit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/krb5-pkinit-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-pkinit = " \
 keyutils-libs \
 openssl-libs \
 krb5-libs \
 libcom_err \
 glibc \
"

URI_krb5-server = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/krb5-server-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-server = " \
 libkadm5 \
 logrotate \
 systemd \
 libverto \
 libss \
 libverto-libev \
 keyutils-libs \
 openssl-libs \
 krb5-libs \
 libcom_err \
 bash \
 krb5-pkinit \
 words \
 glibc \
 libselinux \
 lmdb-libs \
"

URI_krb5-server-ldap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/krb5-server-ldap-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-server-ldap = " \
 libkadm5 \
 keyutils-libs \
 openssl-libs \
 krb5-libs \
 libcom_err \
 krb5-server \
 glibc \
 openldap \
"

URI_krb5-workstation = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/krb5-workstation-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-workstation = " \
 libkadm5 \
 libss \
 pam-libs \
 krb5-libs \
 libcom_err \
 bash \
 krb5-pkinit \
 glibc \
"

URI_libkadm5 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libkadm5-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:libkadm5 = " \
 keyutils-libs \
 openssl-libs \
 krb5-libs \
 libcom_err \
 glibc \
"

URI_krb5-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/krb5-devel-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-devel = " \
 libkadm5 \
 pkgconf-pkg-config \
 krb5-libs \
 libselinux-devel \
 bash \
 libcom_err-devel \
 keyutils-libs-devel \
 krb5-devel \
 libverto-devel \
"

URI_krb5-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/krb5-tests-1.21.3-8.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:krb5-tests = " \
 resolv_wrapper \
 crypto-policies \
 keyutils \
 iproute \
 pam-devel \
 libcom_err-devel \
 net-tools \
 python3-kdcproxy \
 libverto-devel \
 rpcbind \
 words \
 sed \
 gcc-c++ \
 libss-devel \
 softhsm \
 opensc \
 libverto-libev \
 openldap-devel \
 redhat-rpm-config \
 openssl-devel \
 bash \
 libselinux-devel \
 lmdb-devel \
 keyutils-libs-devel \
 logrotate \
 coreutils \
 libcmocka-devel \
 gawk \
 hostname \
 gettext \
 procps-ng \
 dejagnu \
 perl-interpreter \
"
