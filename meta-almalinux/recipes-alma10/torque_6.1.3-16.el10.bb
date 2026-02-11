
PN = "torque"
PE = "0"
PV = "6.1.3"
PR = "16.el10"
PACKAGES = "torque-libs torque torque-client torque-devel torque-docs torque-drmaa torque-drmaa-devel torque-gui torque-mom torque-pam torque-scheduler torque-server"


URI_torque-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/torque-libs-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libxml2.so.2()(64bit) ( ) libhwloc.so.15()(64bit) ( ) libmunge.so.2()(64bit) ( ) munge ( ) libjsoncpp.so.25()(64bit) ( )"
RPROVIDES:torque-libs = "libtorque.so.2()(64bit) ( ) libtorque ( =  6.1.3-16.el10) torque-libs ( =  6.1.3-16.el10) torque-libs(x86-64) ( =  6.1.3-16.el10)"

URI_torque = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque = "/bin/sh ( ) systemd ( ) /etc/services ( ) /usr/bin/cat ( ) /usr/bin/grep ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libtorque.so.2()(64bit) ( ) munge ( )"
RPROVIDES:torque = "torque ( =  6.1.3-16.el10) config(torque) ( =  6.1.3-16.el10) torque(x86-64) ( =  6.1.3-16.el10)"

URI_torque-client = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-client-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-client = "rtld(GNU_HASH) ( ) /usr/bin/sh ( ) /bin/sh ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libz.so.1()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libtorque.so.2()(64bit) ( ) /usr/sbin/alternatives ( ) libtcl8.6.so()(64bit) ( ) libreadline.so.8()(64bit) ( ) torque-libs(x86-64) ( =  6.1.3-16.el10)"
RPROVIDES:torque-client = "torque-client ( =  6.1.3-16.el10) torque-client(x86-64) ( =  6.1.3-16.el10)"

URI_torque-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-devel-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-devel = "/usr/bin/sh ( ) libtorque.so.2()(64bit) ( ) torque-libs(x86-64) ( =  6.1.3-16.el10)"
RPROVIDES:torque-devel = "torque-devel ( =  6.1.3-16.el10) libtorque-devel ( =  6.1.3-16.el10) torque-devel(x86-64) ( =  6.1.3-16.el10)"

URI_torque-docs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-docs-6.1.3-16.el10.noarch.rpm;unpack=0"
RDEPENDS:torque-docs = "torque ( =  6.1.3-16.el10)"
RPROVIDES:torque-docs = "torque-docs ( =  6.1.3-16.el10)"

URI_torque-drmaa = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-drmaa-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-drmaa = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libz.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libtorque.so.2()(64bit) ( ) libjsoncpp.so.25()(64bit) ( ) libhwloc.so.15()(64bit) ( ) libmunge.so.2()(64bit) ( ) torque-libs(x86-64) ( =  6.1.3-16.el10)"
RPROVIDES:torque-drmaa = "libdrmaa.so.0()(64bit) ( ) torque-drmaa ( =  6.1.3-16.el10) torque-drmaa(x86-64) ( =  6.1.3-16.el10)"

URI_torque-drmaa-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-drmaa-devel-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-drmaa-devel = "libdrmaa.so.0()(64bit) ( ) torque-devel ( =  6.1.3-16.el10) torque-drmaa ( =  6.1.3-16.el10)"
RPROVIDES:torque-drmaa-devel = "torque-drmaa-devel ( =  6.1.3-16.el10) torque-drmaa-devel(x86-64) ( =  6.1.3-16.el10)"

URI_torque-gui = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-gui-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-gui = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libtorque.so.2()(64bit) ( ) libtcl8.6.so()(64bit) ( ) /usr/bin/wish8.6 ( ) libtk8.6.so()(64bit) ( ) torque-libs(x86-64) ( =  6.1.3-16.el10) torque-client ( =  6.1.3-16.el10)"
RPROVIDES:torque-gui = "application() ( ) application(adaptivecomputing.com-xpbs.desktop) ( ) application(adaptivecomputing.com-xpbsmon.desktop) ( ) torque-gui ( =  6.1.3-16.el10) torque-gui(x86-64) ( =  6.1.3-16.el10)"

URI_torque-mom = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-mom-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-mom = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) systemd ( ) libtorque.so.2()(64bit) ( ) openssh-clients ( ) libjsoncpp.so.25()(64bit) ( ) libhwloc.so.15()(64bit) ( ) munge ( ) torque-libs(x86-64) ( =  6.1.3-16.el10)"
RPROVIDES:torque-mom = "config(torque-mom) ( =  6.1.3-16.el10) torque-mom ( =  6.1.3-16.el10) torque-mom(x86-64) ( =  6.1.3-16.el10)"

URI_torque-pam = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-pam-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-pam = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libz.so.1()(64bit) ( ) libxml2.so.2()(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libjsoncpp.so.25()(64bit) ( ) libhwloc.so.15()(64bit) ( ) libmunge.so.2()(64bit) ( )"
RPROVIDES:torque-pam = "torque-pam ( =  6.1.3-16.el10) torque-pam(x86-64) ( =  6.1.3-16.el10)"

URI_torque-scheduler = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-scheduler-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-scheduler = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) systemd ( ) libtorque.so.2()(64bit) ( ) torque-libs(x86-64) ( =  6.1.3-16.el10)"
RPROVIDES:torque-scheduler = "config(torque-scheduler) ( =  6.1.3-16.el10) torque-scheduler ( =  6.1.3-16.el10) torque-scheduler(x86-64) ( =  6.1.3-16.el10)"

URI_torque-server = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/torque-server-6.1.3-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:torque-server = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) ( ) libxml2.so.2()(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libxml2.so.2(LIBXML2_2.4.30)(64bit) ( ) libxml2.so.2(LIBXML2_2.6.0)(64bit) ( ) systemd ( ) libtorque.so.2()(64bit) ( ) libjsoncpp.so.25()(64bit) ( ) libmunge.so.2()(64bit) ( ) munge ( ) openssh-server ( ) torque-libs(x86-64) ( =  6.1.3-16.el10)"
RPROVIDES:torque-server = "torque-server ( =  6.1.3-16.el10) torque-server(x86-64) ( =  6.1.3-16.el10)"
