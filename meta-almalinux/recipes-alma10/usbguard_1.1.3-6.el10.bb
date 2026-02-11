
PN = "usbguard"
PE = "0"
PV = "1.1.3"
PR = "6.el10"
PACKAGES = "usbguard usbguard-dbus usbguard-notifier usbguard-selinux usbguard-tools usbguard-devel"


URI_usbguard = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard = "/bin/sh ( ) systemd ( ) /sbin/ldconfig ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.13)(64bit) ( ) libcap-ng.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.11)(64bit) ( ) libaudit.so.1()(64bit) ( ) libqb.so.100()(64bit) ( ) libprotobuf.so.30()(64bit) ( )"
RPROVIDES:usbguard = "libusbguard.so.1()(64bit) ( ) usbguard ( =  1.1.3-6.el10) config(usbguard) ( =  1.1.3-6.el10) usbguard(x86-64) ( =  1.1.3-6.el10)"

URI_usbguard-dbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-dbus-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-dbus = "/bin/sh ( ) rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libgio-2.0.so.0()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libpolkit-gobject-1.so.0()(64bit) ( ) dbus ( ) polkit ( ) libusbguard.so.1()(64bit) ( ) usbguard ( =  1.1.3-6.el10)"
RPROVIDES:usbguard-dbus = "usbguard-dbus ( =  1.1.3-6.el10) usbguard-dbus(x86-64) ( =  1.1.3-6.el10)"

URI_usbguard-notifier = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-notifier-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-notifier = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgobject-2.0.so.0()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) systemd ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) ( ) libnotify.so.4()(64bit) ( ) librsvg-2.so.2()(64bit) ( ) libusbguard.so.1()(64bit) ( ) usbguard ( =  1.1.3-6.el10)"
RPROVIDES:usbguard-notifier = "usbguard-notifier ( =  1.1.3-6.el10) usbguard-notifier(x86-64) ( =  1.1.3-6.el10)"

URI_usbguard-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-selinux-1.1.3-6.el10.noarch.rpm;unpack=0"
RDEPENDS:usbguard-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.25) selinux-policy ( >=  40.13.25)"
RPROVIDES:usbguard-selinux = "usbguard-selinux ( =  1.1.3-6.el10)"

URI_usbguard-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/usbguard-tools-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-tools = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libusbguard.so.1()(64bit) ( ) usbguard ( =  1.1.3-6.el10)"
RPROVIDES:usbguard-tools = "usbguard-tools ( =  1.1.3-6.el10) usbguard-tools(x86-64) ( =  1.1.3-6.el10)"

URI_usbguard-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/usbguard-devel-1.1.3-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:usbguard-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libstdc++-devel ( ) libusbguard.so.1()(64bit) ( ) pkgconfig(libqb) ( ) usbguard ( =  1.1.3-6.el10)"
RPROVIDES:usbguard-devel = "pkgconfig(libusbguard) ( =  1.1.3) usbguard-devel ( =  1.1.3-6.el10) usbguard-devel(x86-64) ( =  1.1.3-6.el10)"
