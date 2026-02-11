
PN = "dnsconfd"
PE = "0"
PV = "1.7.2"
PR = "1.el10_0"
PACKAGES = "dnsconfd dnsconfd-dracut dnsconfd-micro dnsconfd-selinux dnsconfd-unbound"


URI_dnsconfd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-1.7.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dnsconfd = "/bin/sh ( ) shadow-utils ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) python3-gobject-base ( ) polkit ( ) python3-pyyaml ( ) python3.12dist(pyyaml) ( ) python3-systemd ( ) python3.12dist(dbus-python) ( ) dbus-common ( ) dnsconfd-cache ( ) python(abi) ( =  3.12) dnsconfd-selinux ( if  selinux-policy-targeted)"
RPROVIDES:dnsconfd = "group(dnsconfd) ( ) dnsconfd ( =  1.7.2-1.el10_0) config(dnsconfd) ( =  1.7.2-1.el10_0) dnsconfd(x86-64) ( =  1.7.2-1.el10_0) python3.12dist(dnsconfd) ( =  1.7.2) python3dist(dnsconfd) ( =  1.7.2) user(dnsconfd) ( =  dSBkbnNjb25mZCAtICJEbnNjb25mZCBsb2NhbCBETlMgY2FjaGUgY29uZmlndXJhdG9yIiAtIC9zYmluL25vbG9naW4A)"

URI_dnsconfd-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-dracut-1.7.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dnsconfd-dracut = "/usr/bin/bash ( ) unbound ( ) dracut ( ) dracut-network ( ) dnsconfd-micro(x86-64) ( =  1.7.2-1.el10_0)"
RPROVIDES:dnsconfd-dracut = "dnsconfd-dracut ( =  1.7.2-1.el10_0) dnsconfd-dracut(x86-64) ( =  1.7.2-1.el10_0)"

URI_dnsconfd-micro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-micro-1.7.2-1.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dnsconfd-micro = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libcurl.so.4()(64bit) ( ) glib2 ( ) unbound-dracut ( ) systemd-libs ( ) libcurl ( ) dnsconfd ( =  1.7.2-1.el10_0) dnsconfd-selinux ( if  selinux-policy-targeted)"
RPROVIDES:dnsconfd-micro = "dnsconfd-micro(x86-64) ( =  1.7.2-1.el10_0) config(dnsconfd-micro) ( =  1.7.2-1.el10_0) dnsconfd-micro ( =  1.7.2-1.el10_0)"

URI_dnsconfd-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-selinux-1.7.2-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:dnsconfd-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.26) selinux-policy ( >=  40.13.26) dnsconfd ( =  1.7.2-1.el10_0)"
RPROVIDES:dnsconfd-selinux = "dnsconfd-selinux ( =  1.7.2-1.el10_0)"

URI_dnsconfd-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-unbound-1.7.2-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:dnsconfd-unbound = "/bin/sh ( ) unbound ( ) dnsconfd ( =  1.7.2-1.el10_0)"
RPROVIDES:dnsconfd-unbound = "dnsconfd-unbound ( =  1.7.2-1.el10_0) config(dnsconfd-unbound) ( =  1.7.2-1.el10_0) dnsconfd-cache ( =  1.7.2-1.el10_0)"
