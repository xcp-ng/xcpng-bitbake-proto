
PN = "polkit"
PE = "0"
PV = "125"
PR = "3.el10"
PACKAGES = "polkit polkit-libs polkit-devel polkit-docs"


URI_polkit = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/polkit-125-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:polkit = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) dbus ( ) libexpat.so.1()(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) libduktape.so.207()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_213)(64bit) ( ) libpolkit-agent-1.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_253)(64bit) ( ) polkit-libs(x86-64) ( =  125-3.el10)"
RPROVIDES:polkit = "group(polkitd) ( ) PolicyKit ( =  0.11) polkit ( =  125-3.el10) polkit(x86-64) ( =  125-3.el10) polkit-desktop-policy ( =  0.103) polkit-js-engine ( =  125-3.el10) user(polkitd) ( =  dSBwb2xraXRkIDExNCAiVXNlciBmb3IgcG9sa2l0ZCIgLyAvc2Jpbi9ub2xvZ2lu)"

URI_polkit-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/polkit-libs-125-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:polkit-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_213)(64bit) ( )"
RPROVIDES:polkit-libs = "libpolkit-gobject-1.so.0()(64bit) ( ) libpolkit-agent-1.so.0()(64bit) ( ) polkit-libs(x86-64) ( =  125-3.el10) polkit-libs ( =  125-3.el10)"

URI_polkit-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/polkit-devel-125-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:polkit-devel = "/usr/bin/pkg-config ( ) libpolkit-gobject-1.so.0()(64bit) ( ) glib2-devel ( ) libpolkit-agent-1.so.0()(64bit) ( ) pkgconfig(polkit-gobject-1) ( ) pkgconfig(glib-2.0) ( >=  2.30.0) polkit-docs ( =  125-3.el10) polkit-libs(x86-64) ( =  125-3.el10) pkgconfig(gio-2.0) ( >=  2.30.0) pkgconfig(gio-unix-2.0) ( >=  2.30.0)"
RPROVIDES:polkit-devel = "polkit-devel ( =  125-3.el10) PolicyKit-devel ( =  0.11) pkgconfig(polkit-agent-1) ( =  125) pkgconfig(polkit-gobject-1) ( =  125) polkit-devel(x86-64) ( =  125-3.el10)"

URI_polkit-docs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/polkit-docs-125-3.el10.noarch.rpm;unpack=0"
RDEPENDS:polkit-docs = "polkit-devel ( =  125-3.el10)"
RPROVIDES:polkit-docs = "polkit-docs ( =  125-3.el10) PolicyKit-docs ( =  0.11)"
