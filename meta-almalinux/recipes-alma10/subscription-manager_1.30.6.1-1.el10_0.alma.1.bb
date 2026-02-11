
inherit dnf-bridge

PN = "subscription-manager"
PE = "0"
PV = "1.30.6.1"
PR = "1.el10_0.alma.1"
PACKAGES = "libdnf-plugin-subscription-manager python3-cloud-what python3-subscription-manager-rhsm subscription-manager subscription-manager-plugin-ostree"


URI_libdnf-plugin-subscription-manager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdnf-plugin-subscription-manager-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdnf-plugin-subscription-manager = " \
 zlib-ng-compat \
 openssl-libs \
 json-c \
 glib2 \
 librepo \
 glibc \
 libdnf \
"

URI_python3-cloud-what = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-cloud-what-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cloud-what = " \
 python3 \
 dmidecode \
 python3-requests \
"

URI_python3-subscription-manager-rhsm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-subscription-manager-rhsm-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-subscription-manager-rhsm = " \
 python3 \
 python3-iniparse \
 python3-rpm \
 python3-cloud-what \
 python3-dateutil \
 openssl-libs \
 glibc \
 subscription-manager-rhsm-certificates \
"

URI_subscription-manager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/subscription-manager-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:subscription-manager = " \
 python3 \
 systemd \
 python3-cloud-what \
 iproute \
 python3-dateutil \
 python3-dbus \
 python3-decorator \
 python3-dnf \
 python3-dnf-plugins-core \
 python3-gobject-base \
 python3-iniparse \
 python3-inotify \
 dmidecode \
 python3-librepo \
 virt-what \
 libdnf-plugin-subscription-manager \
 bash \
 python3-subscription-manager-rhsm \
 glib2 \
 glibc \
 subscription-manager-rhsm-certificates \
"

URI_subscription-manager-plugin-ostree = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/subscription-manager-plugin-ostree-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:subscription-manager-plugin-ostree = " \
 python3 \
 python3-iniparse \
 subscription-manager \
 python3-gobject-base \
"
