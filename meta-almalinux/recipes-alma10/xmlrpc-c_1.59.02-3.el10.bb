
inherit dnf-bridge

PN = "xmlrpc-c"
PE = "0"
PV = "1.59.02"
PR = "3.el10"
PACKAGES = "xmlrpc-c xmlrpc-c-apps xmlrpc-c-c++ xmlrpc-c-client++ xmlrpc-c-client xmlrpc-c-devel"


URI_xmlrpc-c = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlrpc-c-1.59.02-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlrpc-c = " \
 glibc \
 openssl-libs \
 libgcc \
"

URI_xmlrpc-c-apps = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlrpc-c-apps-1.59.02-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlrpc-c-apps = " \
 xmlrpc-c \
 xmlrpc-c-c++ \
 xmlrpc-c-client++ \
 xmlrpc-c-client \
 libgcc \
 readline \
 libstdc++ \
 glibc \
 perl-interpreter \
"

URI_xmlrpc-c-c++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlrpc-c-c++-1.59.02-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlrpc-c-c++ = " \
 glibc \
 xmlrpc-c \
 libgcc \
 libstdc++ \
"

URI_xmlrpc-c-client++ = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlrpc-c-client++-1.59.02-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlrpc-c-client++ = " \
 xmlrpc-c \
 xmlrpc-c-c++ \
 xmlrpc-c-client \
 libgcc \
 libstdc++ \
 glibc \
"

URI_xmlrpc-c-client = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlrpc-c-client-1.59.02-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlrpc-c-client = " \
 glibc \
 xmlrpc-c \
 libcurl \
"

URI_xmlrpc-c-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/xmlrpc-c-devel-1.59.02-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xmlrpc-c-devel = " \
 xmlrpc-c \
 xmlrpc-c-c++ \
 xmlrpc-c-client++ \
 xmlrpc-c-client \
 xmlrpc-c-devel \
 pkgconf-pkg-config \
 bash \
"
