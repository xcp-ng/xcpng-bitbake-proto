
PN = "openscap"
PE = "1"
PV = "1.4.2"
PR = "1.el10_0.alma.1"
PACKAGES = "openscap openscap-engine-sce openscap-scanner openscap-utils"


URI_openscap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openscap-1.4.2-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openscap = " \
 nss \
 procps-ng \
 dbus \
 dbus-libs \
 libselinux \
 xmlsec1 \
 xmlsec1-openssl \
 libacl \
 libblkid \
 libcap \
 libcurl \
 openldap \
 libgcc \
 libxml2 \
 libyaml \
 pcre2 \
 bash \
 libxslt \
 bzip2-libs \
 glib2 \
 popt \
 glibc \
 rpm-libs \
"

URI_openscap-engine-sce = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openscap-engine-sce-1.4.2-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openscap-engine-sce = " \
 glibc \
 openscap \
"

URI_openscap-scanner = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openscap-scanner-1.4.2-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openscap-scanner = " \
 glibc \
 openscap \
 bash \
 libcurl \
"

URI_openscap-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openscap-utils-1.4.2-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:openscap-utils = " \
 python3 \
 openscap \
 openscap-scanner \
 rpm-build \
 bash \
 rpmdevtools \
"
