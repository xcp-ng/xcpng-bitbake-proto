
inherit dnf-bridge

PN = "cyrus-imapd"
PE = "0"
PV = "3.8.3"
PR = "7.el10"
PACKAGES = "cyrus-imapd cyrus-imapd-libs cyrus-imapd-utils perl-Cyrus cyrus-imapd-devel cyrus-imapd-doc-extra cyrus-imapd-virusscan"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/cyrus-imapd-3.8.3-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_cyrus-imapd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-imapd-3.8.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cyrus-imapd}"
RDEPENDS:cyrus-imapd = " \
 systemd \
 perl-libs \
 perl-Getopt-Long \
 perl-Getopt-Std \
 cyrus-sasl-lib \
 jansson \
 cyrus-imapd-libs \
 cyrus-imapd-utils \
 libcom_err \
 perl-Cyrus \
 openldap \
 shadow-utils \
 zlib-ng-compat \
 openssl-libs \
 libxml2 \
 libzstd \
 sqlite-libs \
 bash \
 pcre2 \
 file \
 sscg \
 libical \
 libnghttp2 \
 glibc \
 perl-interpreter \
"

URI_cyrus-imapd-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-imapd-libs-3.8.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cyrus-imapd-libs}"
RDEPENDS:cyrus-imapd-libs = " \
 libpq \
 krb5-libs \
 cyrus-sasl-lib \
 jansson \
 libstdc++ \
 libcom_err \
 libuuid \
 zlib-ng-compat \
 openssl-libs \
 libgcc \
 libxml2 \
 libzstd \
 sqlite-libs \
 xapian-core-libs \
 pcre2 \
 libicu \
 libical \
 mariadb-connector-c \
 libnghttp2 \
 glibc \
"

URI_cyrus-imapd-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cyrus-imapd-utils-3.8.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cyrus-imapd-utils}"
RDEPENDS:cyrus-imapd-utils = " \
 perl-libs \
 cyrus-imapd-libs \
 openssl-libs \
 perl-Getopt-Long \
 perl-POSIX \
 cyrus-sasl-lib \
 perl-File-Temp \
 perl-Cyrus \
 bash \
 glibc \
 perl-interpreter \
 perl-Term-ReadLine \
 perl-lib \
 perl-Pod-Usage \
"

URI_perl-Cyrus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Cyrus-3.8.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_perl-Cyrus}"
RDEPENDS:perl-Cyrus = " \
 perl-libs \
 libpq \
 perl-Getopt-Long \
 cyrus-sasl-lib \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Cyrus \
 perl-JSON \
 perl-MIME-Base64 \
 libuuid \
 zlib-ng-compat \
 perl-URI \
 openssl-libs \
 perl-Unix-Syslog \
 perl-DynaLoader \
 sqlite-libs \
 perl-Encode \
 pcre2 \
 perl-Exporter \
 perl-base \
 perl-Net-Server \
 perl-constant \
 perl-POSIX \
 mariadb-connector-c \
 glibc \
 perl-File-Path \
"

URI_cyrus-imapd-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cyrus-imapd-devel-3.8.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cyrus-imapd-devel}"
RDEPENDS:cyrus-imapd-devel = " \
 cyrus-imapd-libs \
 pkgconf-pkg-config \
"

URI_cyrus-imapd-doc-extra = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cyrus-imapd-doc-extra-3.8.3-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_cyrus-imapd-doc-extra}"
RDEPENDS:cyrus-imapd-doc-extra = ""

URI_cyrus-imapd-virusscan = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/cyrus-imapd-virusscan-3.8.3-7.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_cyrus-imapd-virusscan}"
RDEPENDS:cyrus-imapd-virusscan = " \
 glibc \
 cyrus-imapd-libs \
 libcom_err \
"
