
PN = "environment-modules"
PE = "0"
PV = "5.3.1"
PR = "8.el10"
PACKAGES = "environment-modules"


URI_environment-modules = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/environment-modules-5.3.1-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:environment-modules = "/bin/sh ( ) coreutils ( ) /usr/sbin/update-alternatives ( ) rtld(GNU_HASH) ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) sed ( ) procps-ng ( ) vim-filesystem ( ) less ( ) /usr/bin/tclsh ( ) man-db ( ) tcl ( )"
RPROVIDES:environment-modules = "environment(modules) ( ) libtclenvmodules.so()(64bit) ( ) rpm_macro(_modulesdir) ( ) config(environment-modules) ( =  5.3.1-8.el10) environment-modules ( =  5.3.1-8.el10) environment-modules(x86-64) ( =  5.3.1-8.el10)"
