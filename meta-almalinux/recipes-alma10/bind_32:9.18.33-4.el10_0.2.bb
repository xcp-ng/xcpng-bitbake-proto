
inherit dnf-bridge

PN = "bind"
PE = "32"
PV = "9.18.33"
PR = "4.el10_0.2"
PACKAGES = "bind bind-chroot bind-dnssec-utils bind-libs bind-license bind-utils bind-devel bind-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/bind-9.18.33-4.el10_0.2.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bind = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-9.18.33-4.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind}"
RDEPENDS:bind = " \
 glibc-common \
 shadow-utils \
 zlib-ng-compat \
 bind-libs \
 openssl-libs \
 json-c \
 grep \
 libxml2 \
 libcap \
 fstrm \
 libmaxminddb \
 libuv \
 bash \
 libnghttp2 \
 glibc \
 coreutils \
 protobuf-c \
 lmdb-libs \
"

URI_bind-chroot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-chroot-9.18.33-4.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind-chroot}"
RDEPENDS:bind-chroot = " \
 bind \
 bash \
 grep \
"

URI_bind-dnssec-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-dnssec-utils-9.18.33-4.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind-dnssec-utils}"
RDEPENDS:bind-dnssec-utils = " \
 glibc \
 bind-libs \
"

URI_bind-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-libs-9.18.33-4.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind-libs}"
RDEPENDS:bind-libs = " \
 zlib-ng-compat \
 bind-license \
 openssl-libs \
 json-c \
 libxml2 \
 libmaxminddb \
 fstrm \
 krb5-libs \
 libcom_err \
 libuv \
 libnghttp2 \
 glibc \
 protobuf-c \
 lmdb-libs \
"

URI_bind-license = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-license-9.18.33-4.el10_0.2.noarch.rpm;unpack=0"
SRC_URI += "${URI_bind-license}"
RDEPENDS:bind-license = ""

URI_bind-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bind-utils-9.18.33-4.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind-utils}"
RDEPENDS:bind-utils = " \
 bind-libs \
 krb5-libs \
 libidn2 \
 glibc \
 protobuf-c \
 lmdb-libs \
"

URI_bind-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bind-devel-9.18.33-4.el10_0.2.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_bind-devel}"
RDEPENDS:bind-devel = " \
 libxml2-devel \
 bind-libs \
 fstrm-devel \
 libcap-devel \
 openssl-devel \
 libmaxminddb-devel \
 lmdb-devel \
 krb5-devel \
 protobuf-c-devel \
 json-c-devel \
"

URI_bind-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bind-doc-9.18.33-4.el10_0.2.noarch.rpm;unpack=0"
SRC_URI += "${URI_bind-doc}"
RDEPENDS:bind-doc = " \
 python3-sphinx_rtd_theme \
 bind-license \
"
