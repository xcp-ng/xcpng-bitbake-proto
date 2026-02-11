
PN = "openwsman"
PE = "0"
PV = "2.7.2"
PR = "9.el10"
PACKAGES = "libwsman1 openwsman-python3 openwsman-selinux openwsman-server libwsman-devel openwsman-client openwsman-perl openwsman-winrs rubygem-openwsman rubygem-openwsman-doc"


URI_libwsman1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libwsman1-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwsman1 = " \
 glibc \
 libxml2 \
 libcurl \
"

URI_openwsman-python3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openwsman-python3-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-python3 = " \
 glibc \
 libwsman1 \
 python3 \
"

URI_openwsman-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openwsman-selinux-2.7.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:openwsman-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"

URI_openwsman-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openwsman-server-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-server = " \
 libxcrypt \
 openssl-libs \
 sblim-sfcc \
 pam-libs \
 libwsman1 \
 bash \
 ruby-libs \
 glibc \
 openwsman-selinux \
"

URI_libwsman-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libwsman-devel-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libwsman-devel = " \
 libxml2-devel \
 sblim-sfcc-devel \
 pam-devel \
 pkgconf-pkg-config \
 libwsman1 \
 libcurl-devel \
 openwsman-client \
 openwsman-server \
"

URI_openwsman-client = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openwsman-client-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-client = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_openwsman-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openwsman-perl-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-perl = " \
 perl-libs \
 perl-vars \
 perl-DynaLoader \
 libwsman1 \
 perl-overload \
 glibc \
 perl-Exporter \
 perl-base \
"

URI_openwsman-winrs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openwsman-winrs-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openwsman-winrs = " \
 rubygem-openwsman \
 ruby \
"

URI_rubygem-openwsman = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-openwsman-2.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rubygem-openwsman = " \
 glibc \
 rubygems \
 libwsman1 \
 ruby-libs \
"

URI_rubygem-openwsman-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rubygem-openwsman-doc-2.7.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:rubygem-openwsman-doc = " \
 rubygem-openwsman \
"
