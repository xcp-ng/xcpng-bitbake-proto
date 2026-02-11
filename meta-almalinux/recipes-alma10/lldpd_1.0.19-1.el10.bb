
PN = "lldpd"
PE = "0"
PV = "1.0.19"
PR = "1.el10"
PACKAGES = "lldpd lldpd-devel"


URI_lldpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lldpd-1.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpd = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.5)(64bit) ( ) libevent-2.1.so.7()(64bit) ( ) libnetsnmpagent.so.40()(64bit) ( ) libxml2.so.2(LIBXML2_2.6.3)(64bit) ( ) libnetsnmpmibs.so.40()(64bit) ( )"
RPROVIDES:lldpd = "group(lldpd) ( ) liblldpctl.so.4()(64bit) ( ) liblldpctl.so.4(LIBLLDPCTL_4.10)(64bit) ( ) liblldpctl.so.4(LIBLLDPCTL_4.6)(64bit) ( ) liblldpctl.so.4(LIBLLDPCTL_4.7)(64bit) ( ) liblldpctl.so.4(LIBLLDPCTL_4.8)(64bit) ( ) liblldpctl.so.4(LIBLLDPCTL_4.9)(64bit) ( ) lldpd(x86-64) ( =  1.0.19-1.el10) config(lldpd) ( =  1.0.19-1.el10) lldpd ( =  1.0.19-1.el10) user(lldpd) ( =  dSBsbGRwZCAtICJVc2VkIGJ5IHRoZSBsbGRwZCBkYWVtb24iIC92YXIvbGliL2xsZHBkIC9zYmluL25vbG9naW4A)"

URI_lldpd-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lldpd-devel-1.0.19-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lldpd-devel = "/usr/bin/pkg-config ( ) liblldpctl.so.4()(64bit) ( ) lldpd(x86-64) ( =  1.0.19-1.el10)"
RPROVIDES:lldpd-devel = "lldpd-devel ( =  1.0.19-1.el10) lldpd-devel(x86-64) ( =  1.0.19-1.el10) pkgconfig(lldpctl) ( =  1.0.19)"
