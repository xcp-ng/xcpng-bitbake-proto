
PN = "initscripts"
PE = "0"
PV = "10.26"
PR = "2.el10"
PACKAGES = "initscripts initscripts-rename-device initscripts-service netconsole-service readonly-root"


URI_initscripts = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/initscripts-10.26-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:initscripts = "/bin/sh ( ) coreutils ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libpopt.so.0()(64bit) ( ) /usr/bin/bash ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) util-linux ( ) grep ( ) bash ( ) gawk ( ) findutils ( ) setup ( ) procps-ng ( ) chkconfig ( ) initscripts-service ( ) initscripts-rename-device ( ) filesystem ( >=  3)"
RPROVIDES:initscripts = "initscripts ( =  10.26-2.el10) initscripts(x86-64) ( =  10.26-2.el10)"

URI_initscripts-rename-device = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/initscripts-rename-device-10.26-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:initscripts-rename-device = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) libglib-2.0.so.0()(64bit) ( ) bash ( ) gawk ( ) filesystem ( >=  3)"
RPROVIDES:initscripts-rename-device = "initscripts-rename-device ( =  10.26-2.el10) initscripts-rename-device(x86-64) ( =  10.26-2.el10)"

URI_initscripts-service = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/initscripts-service-10.26-2.el10.noarch.rpm;unpack=0"
RDEPENDS:initscripts-service = "coreutils ( ) systemd ( ) /usr/bin/bash ( ) bash ( ) gawk ( ) filesystem ( >=  3)"
RPROVIDES:initscripts-service = "/sbin/service ( ) initscripts-service ( =  10.26-2.el10)"

URI_netconsole-service = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/netconsole-service-10.26-2.el10.noarch.rpm;unpack=0"
RDEPENDS:netconsole-service = "/bin/sh ( ) coreutils ( ) /usr/bin/bash ( ) util-linux ( ) sed ( ) bash ( ) gawk ( ) glibc-common ( ) iproute ( ) iputils ( ) kmod ( ) filesystem ( >=  3) initscripts ( =  10.26-2.el10)"
RPROVIDES:netconsole-service = "config(netconsole-service) ( =  10.26-2.el10) netconsole-service ( =  10.26-2.el10)"

URI_readonly-root = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/readonly-root-10.26-2.el10.noarch.rpm;unpack=0"
RDEPENDS:readonly-root = "/bin/sh ( ) coreutils ( ) /usr/bin/bash ( ) util-linux ( ) bash ( ) gawk ( ) iproute ( ) findutils ( ) hostname ( ) cpio ( ) ipcalc ( ) filesystem ( >=  3) initscripts ( =  10.26-2.el10)"
RPROVIDES:readonly-root = "config(readonly-root) ( =  10.26-2.el10) readonly-root ( =  10.26-2.el10)"
