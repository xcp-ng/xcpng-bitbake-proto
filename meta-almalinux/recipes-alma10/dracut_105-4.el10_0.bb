
PN = "dracut"
PE = "0"
PV = "105"
PR = "4.el10_0"
PACKAGES = "dracut dracut-config-generic dracut-config-rescue dracut-network dracut-squash dracut-tools dracut-caps dracut-live"


URI_dracut = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) grep ( ) sed ( ) kmod ( ) libkmod.so.2()(64bit) ( ) libkmod.so.2(LIBKMOD_5)(64bit) ( ) findutils ( ) procps-ng ( ) gzip ( ) cpio ( ) xz ( ) libkcapi-hmaccalc ( ) libkmod.so.2(LIBKMOD_22)(64bit) ( ) bash ( >=  4) filesystem ( >=  2.1.0) systemd ( >=  219) systemd-udev ( >=  219) util-linux ( >=  2.21)"
RPROVIDES:dracut = "dracut ( =  105-4.el10_0) config(dracut) ( =  105-4.el10_0) dracut(x86-64) ( =  105-4.el10_0) dracut-fips ( =  105-4.el10_0) dracut-fips-aesni ( =  105-4.el10_0) pkgconfig(dracut) ( =  f9b2571)"

URI_dracut-config-generic = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-config-generic-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-config-generic = "dracut ( =  105-4.el10_0)"
RPROVIDES:dracut-config-generic = "dracut-config-generic ( =  105-4.el10_0) dracut-config-generic(x86-64) ( =  105-4.el10_0) dracut-nohostonly ( =  105-4.el10_0)"

URI_dracut-config-rescue = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-config-rescue-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-config-rescue = "/usr/bin/bash ( ) dracut ( =  105-4.el10_0)"
RPROVIDES:dracut-config-rescue = "dracut-config-rescue ( =  105-4.el10_0) dracut-config-rescue(x86-64) ( =  105-4.el10_0)"

URI_dracut-network = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-network-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-network = "/usr/bin/sh ( ) /usr/bin/bash ( ) iproute ( ) iputils ( ) jq ( ) dracut ( =  105-4.el10_0) NetworkManager ( >=  1.20)"
RPROVIDES:dracut-network = "dracut-generic ( =  105-4.el10_0) dracut-network ( =  105-4.el10_0) dracut-network(x86-64) ( =  105-4.el10_0)"

URI_dracut-squash = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-squash-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-squash = "/usr/bin/sh ( ) /usr/bin/bash ( ) erofs-utils ( ) dracut ( =  105-4.el10_0)"
RPROVIDES:dracut-squash = "dracut-squash ( =  105-4.el10_0) dracut-squash(x86-64) ( =  105-4.el10_0)"

URI_dracut-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/dracut-tools-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-tools = "/usr/bin/bash ( ) dracut ( =  105-4.el10_0)"
RPROVIDES:dracut-tools = "dracut-tools ( =  105-4.el10_0) dracut-tools(x86-64) ( =  105-4.el10_0)"

URI_dracut-caps = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dracut-caps-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-caps = "/usr/bin/bash ( ) libcap ( ) dracut ( =  105-4.el10_0)"
RPROVIDES:dracut-caps = "dracut-caps ( =  105-4.el10_0) dracut-caps(x86-64) ( =  105-4.el10_0)"

URI_dracut-live = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dracut-live-105-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:dracut-live = "/usr/bin/sh ( ) /usr/bin/bash ( ) coreutils ( ) bash ( ) tar ( ) curl ( ) gzip ( ) parted ( ) device-mapper ( ) dracut ( =  105-4.el10_0) dracut-network ( =  105-4.el10_0)"
RPROVIDES:dracut-live = "dracut-live ( =  105-4.el10_0) dracut-live(x86-64) ( =  105-4.el10_0)"
