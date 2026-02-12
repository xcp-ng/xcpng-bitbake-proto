
inherit dnf-bridge

PN = "squid"
PE = "7"
PV = "6.10"
PR = "5.el10"
PACKAGES = "squid"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/squid-6.10-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_squid = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/squid-6.10-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_squid}"
RDEPENDS:squid = " \
 perl-libnet \
 systemd \
 perl-libs \
 systemd-libs \
 libtool-ltdl \
 perl-FileHandle \
 perl-Getopt-Long \
 perl-Getopt-Std \
 krb5-libs \
 cyrus-sasl-lib \
 libecap \
 perl-vars \
 httpd-filesystem \
 libcap \
 perl-IPC-Open3 \
 libstdc++ \
 libcom_err \
 libtdb \
 perl-DBI \
 perl-Data-Dumper \
 openldap \
 shadow-utils \
 perl-URI \
 libxcrypt \
 perl-Digest-MD5 \
 libgcc \
 openssl-libs \
 perl-Digest-SHA \
 pam-libs \
 bash \
 perl-English \
 gawk \
 perl-File-Basename \
 glibc \
 perl-interpreter \
 perl-Pod-Usage \
"
