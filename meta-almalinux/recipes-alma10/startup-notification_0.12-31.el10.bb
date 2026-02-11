
PN = "startup-notification"
PE = "0"
PV = "0.12"
PR = "31.el10"
PACKAGES = "startup-notification startup-notification-devel"


URI_startup-notification = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/startup-notification-0.12-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:startup-notification = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libX11.so.6()(64bit) ( ) libxcb.so.1()(64bit) ( ) libX11-xcb.so.1()(64bit) ( ) libxcb-util.so.1()(64bit) ( )"
RPROVIDES:startup-notification = "libstartup-notification-1.so.0()(64bit) ( ) startup-notification(x86-64) ( =  0.12-31.el10) startup-notification ( =  0.12-31.el10)"

URI_startup-notification-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/startup-notification-devel-0.12-31.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:startup-notification-devel = "/usr/bin/pkg-config ( ) libstartup-notification-1.so.0()(64bit) ( ) libX11-devel ( ) startup-notification(x86-64) ( =  0.12-31.el10)"
RPROVIDES:startup-notification-devel = "pkgconfig(libstartup-notification-1.0) ( =  0.12) startup-notification-devel ( =  0.12-31.el10) startup-notification-devel(x86-64) ( =  0.12-31.el10)"
