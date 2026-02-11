
PN = "netlabel_tools"
PE = "0"
PV = "0.30.0"
PR = "20.el10"
PACKAGES = "netlabel_tools"


URI_netlabel_tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/netlabel_tools-0.30.0-20.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:netlabel_tools = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/bash ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-genl-3.so.200(libnl_3)(64bit) ( ) libnl3 ( )"
RPROVIDES:netlabel_tools = "config(netlabel_tools) ( =  0.30.0-20.el10) netlabel_tools ( =  0.30.0-20.el10) netlabel_tools(x86-64) ( =  0.30.0-20.el10)"
