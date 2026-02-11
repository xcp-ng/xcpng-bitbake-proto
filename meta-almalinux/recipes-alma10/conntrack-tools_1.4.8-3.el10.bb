
PN = "conntrack-tools"
PE = "0"
PV = "1.4.8"
PR = "3.el10"
PACKAGES = "conntrack-tools"


URI_conntrack-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/conntrack-tools-1.4.8-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:conntrack-tools = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libnfnetlink.so.0()(64bit) ( ) libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit) ( ) libnetfilter_conntrack.so.3()(64bit) ( ) libnetfilter_cthelper.so.0()(64bit) ( ) libnetfilter_cthelper.so.0(LIBNETFILTER_CTHELPER_1.0)(64bit) ( ) libnetfilter_cttimeout.so.1()(64bit) ( ) libnetfilter_cttimeout.so.1(LIBNETFILTER_CTTIMEOUT_1.0)(64bit) ( ) libnetfilter_cttimeout.so.1(LIBNETFILTER_CTTIMEOUT_1.1)(64bit) ( ) libnetfilter_queue.so.1()(64bit) ( )"
RPROVIDES:conntrack-tools = "config(conntrack-tools) ( =  1.4.8-3.el10) conntrack ( =  1.0-1) conntrack-tools ( =  1.4.8-3.el10) conntrack-tools(x86-64) ( =  1.4.8-3.el10)"
