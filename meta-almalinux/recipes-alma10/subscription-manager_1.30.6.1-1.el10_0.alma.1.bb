
PN = "subscription-manager"
PE = "0"
PV = "1.30.6.1"
PR = "1.el10_0.alma.1"
PACKAGES = "libdnf-plugin-subscription-manager python3-cloud-what python3-subscription-manager-rhsm subscription-manager subscription-manager-plugin-ostree"


URI_libdnf-plugin-subscription-manager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libdnf-plugin-subscription-manager-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:libdnf-plugin-subscription-manager = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libz.so.1()(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) librepo.so.0()(64bit) ( ) libdnf.so.2()(64bit) ( )"
RPROVIDES:libdnf-plugin-subscription-manager = "libdnf-plugin-subscription-manager ( =  1.30.6.1-1.el10_0.alma.1) libdnf-plugin-subscription-manager(x86-64) ( =  1.30.6.1-1.el10_0.alma.1)"

URI_python3-cloud-what = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-cloud-what-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cloud-what = "python3-requests ( ) dmidecode ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-cloud-what = "python3-cloud-what ( =  1.30.6.1-1.el10_0.alma.1) python-cloud-what ( =  1.30.6.1-1.el10_0.alma.1) python3-cloud-what(x86-64) ( =  1.30.6.1-1.el10_0.alma.1) python3.12-cloud-what ( =  1.30.6.1-1.el10_0.alma.1)"

URI_python3-subscription-manager-rhsm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-subscription-manager-rhsm-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-subscription-manager-rhsm = "rtld(GNU_HASH) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) python3-dateutil ( ) python3-iniparse ( ) subscription-manager-rhsm-certificates ( ) python3-rpm ( ) python(abi) ( =  3.12) python3-cloud-what ( =  1.30.6.1-1.el10_0.alma.1)"
RPROVIDES:python3-subscription-manager-rhsm = "python-rhsm ( =  1.30.6.1-1.el10_0.alma.1) python-subscription-manager-rhsm ( =  1.30.6.1-1.el10_0.alma.1) python3-rhsm ( =  1.30.6.1-1.el10_0.alma.1) python3-subscription-manager-rhsm ( =  1.30.6.1-1.el10_0.alma.1) python3-subscription-manager-rhsm(x86-64) ( =  1.30.6.1-1.el10_0.alma.1) python3.12-rhsm ( =  1.30.6.1-1.el10_0.alma.1) python3.12-subscription-manager-rhsm ( =  1.30.6.1-1.el10_0.alma.1)"

URI_subscription-manager = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/subscription-manager-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:subscription-manager = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) iproute ( ) python3-dbus ( ) python3-dnf ( ) python3-gobject-base ( ) dmidecode ( ) python3-dateutil ( ) python3-librepo ( ) python3-iniparse ( ) python3-inotify ( ) subscription-manager-rhsm-certificates ( ) virt-what ( ) python3-dnf-plugins-core ( ) python3-decorator ( ) python3.12dist(python-dateutil) ( ) python3.12dist(dbus-python) ( ) python3.12dist(iniparse) ( ) python(abi) ( =  3.12) python3-cloud-what ( =  1.30.6.1-1.el10_0.alma.1) libdnf-plugin-subscription-manager ( =  1.30.6.1) python3-subscription-manager-rhsm ( =  1.30.6.1)"
RPROVIDES:subscription-manager = "group(rhsm) ( =  ZyByaHNtIC0gLQAA) subscription-manager(x86-64) ( =  1.30.6.1-1.el10_0.alma.1) config(subscription-manager) ( =  1.30.6.1-1.el10_0.alma.1) python3.12dist(subscription-manager) ( =  1.30.6.1) python3dist(subscription-manager) ( =  1.30.6.1) subscription-manager ( =  1.30.6.1-1.el10_0.alma.1)"

URI_subscription-manager-plugin-ostree = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/subscription-manager-plugin-ostree-1.30.6.1-1.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:subscription-manager-plugin-ostree = "python3-gobject-base ( ) python(abi) ( =  3.12) subscription-manager(x86-64) ( =  1.30.6.1-1.el10_0.alma.1) python3-iniparse ( >=  0.4)"
RPROVIDES:subscription-manager-plugin-ostree = "subscription-manager-plugin-ostree ( =  1.30.6.1-1.el10_0.alma.1) subscription-manager-plugin-ostree(x86-64) ( =  1.30.6.1-1.el10_0.alma.1)"
