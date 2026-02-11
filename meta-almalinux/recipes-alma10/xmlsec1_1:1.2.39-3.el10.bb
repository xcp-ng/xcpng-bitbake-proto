
inherit dnf-bridge

PN = "xmlsec1"
PE = "1"
PV = "1.2.39"
PR = "3.el10"
PACKAGES = "xmlsec1 xmlsec1-nss xmlsec1-openssl xmlsec1-devel xmlsec1-openssl-devel xmlsec1-nss-devel"


URI_xmlsec1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlsec1-1.2.39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlsec1 = " \
 glibc \
 libxslt \
 libxml2 \
 libtool-ltdl \
"

URI_xmlsec1-nss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlsec1-nss-1.2.39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlsec1-nss = " \
 nss \
 libxslt \
 libtool-ltdl \
 libxml2 \
 nss-util \
 glibc \
 xmlsec1 \
 nspr \
"

URI_xmlsec1-openssl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xmlsec1-openssl-1.2.39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlsec1-openssl = " \
 libxslt \
 libtool-ltdl \
 openssl-libs \
 libxml2 \
 glibc \
 xmlsec1 \
"

URI_xmlsec1-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlsec1-devel-1.2.39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlsec1-devel = " \
 libxml2-devel \
 libxslt-devel \
 pkgconf-pkg-config \
 openssl-devel \
 bash \
 xmlsec1 \
"

URI_xmlsec1-openssl-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xmlsec1-openssl-devel-1.2.39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlsec1-openssl-devel = " \
 libxml2-devel \
 libxslt-devel \
 xmlsec1-devel \
 pkgconf-pkg-config \
 xmlsec1-openssl \
"

URI_xmlsec1-nss-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlsec1-nss-devel-1.2.39-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlsec1-nss-devel = " \
 libxml2-devel \
 nspr-devel \
 libxslt-devel \
 nss-devel \
 xmlsec1-devel \
 pkgconf-pkg-config \
 xmlsec1-nss \
"
