
PN = "libstoragemgmt"
PE = "0"
PV = "1.10.1"
PR = "4.el10"
PACKAGES = "libstoragemgmt libstoragemgmt-arcconf-plugin libstoragemgmt-hpsa-plugin libstoragemgmt-local-plugin libstoragemgmt-megaraid-plugin libstoragemgmt-nfs-plugin libstoragemgmt-targetd-plugin libstoragemgmt-udev python3-libstoragemgmt libstoragemgmt-devel"


URI_libstoragemgmt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) /usr/bin/python3 ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libudev.so.1()(64bit) ( ) libsqlite3.so.0()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) ledmon-libs ( ) libconfig.so.11()(64bit) ( ) libled.so.1()(64bit) ( ) libsgutils2-1.48.so.2()(64bit) ( ) python3-libstoragemgmt(x86-64) ( )"
RPROVIDES:libstoragemgmt = "libstoragemgmt.so.1()(64bit) ( ) libstoragemgmt(x86-64) ( =  1.10.1-4.el10) libstoragemgmt-netapp-plugin ( <=  1.6.2-10) libstoragemgmt-nstor-plugin ( <=  1.9.0-1) libstoragemgmt-smis-plugin ( <=  1.10.1-1) config(libstoragemgmt) ( =  1.10.1-4.el10) libstoragemgmt ( =  1.10.1-4.el10)"

URI_libstoragemgmt-arcconf-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-arcconf-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-arcconf-plugin = "/bin/sh ( ) python3-libstoragemgmt ( =  1.10.1) /usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:libstoragemgmt-arcconf-plugin = "libstoragemgmt-arcconf-plugin ( =  1.10.1-4.el10) config(libstoragemgmt-arcconf-plugin) ( =  1.10.1-4.el10)"

URI_libstoragemgmt-hpsa-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-hpsa-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-hpsa-plugin = "/bin/sh ( ) python3-libstoragemgmt ( =  1.10.1) /usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:libstoragemgmt-hpsa-plugin = "libstoragemgmt-hpsa-plugin ( =  1.10.1-4.el10) config(libstoragemgmt-hpsa-plugin) ( =  1.10.1-4.el10)"

URI_libstoragemgmt-local-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-local-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-local-plugin = "/bin/sh ( ) python3-libstoragemgmt ( =  1.10.1) /usr/bin/python3 ( ) python(abi) ( =  3.12) libstoragemgmt-arcconf-plugin ( =  1.10.1-4.el10) libstoragemgmt-hpsa-plugin ( =  1.10.1-4.el10)"
RPROVIDES:libstoragemgmt-local-plugin = "config(libstoragemgmt-local-plugin) ( =  1.10.1-4.el10) libstoragemgmt-local-plugin ( =  1.10.1-4.el10)"

URI_libstoragemgmt-megaraid-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-megaraid-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-megaraid-plugin = "/bin/sh ( ) python3-libstoragemgmt ( =  1.10.1) /usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:libstoragemgmt-megaraid-plugin = "config(libstoragemgmt-megaraid-plugin) ( =  1.10.1-4.el10) libstoragemgmt-megaraid-plugin ( =  1.10.1-4.el10)"

URI_libstoragemgmt-nfs-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-nfs-plugin-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt-nfs-plugin = "/bin/sh ( ) python3-libstoragemgmt ( =  1.10.1) rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libudev.so.1()(64bit) ( ) libled.so.1()(64bit) ( ) libsgutils2-1.48.so.2()(64bit) ( ) libstoragemgmt.so.1()(64bit) ( ) nfs-utils ( ) libc.so.6(GLIBC_2.8)(64bit) ( ) python(abi) ( =  3.12) libstoragemgmt(x86-64) ( =  1.10.1-4.el10)"
RPROVIDES:libstoragemgmt-nfs-plugin = "config(libstoragemgmt-nfs-plugin) ( =  1.10.1-4.el10) libstoragemgmt-nfs-plugin ( =  1.10.1-4.el10) libstoragemgmt-nfs-plugin(x86-64) ( =  1.10.1-4.el10)"

URI_libstoragemgmt-targetd-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-targetd-plugin-1.10.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:libstoragemgmt-targetd-plugin = "/bin/sh ( ) python3-libstoragemgmt ( =  1.10.1) /usr/bin/python3 ( ) python(abi) ( =  3.12)"
RPROVIDES:libstoragemgmt-targetd-plugin = "libstoragemgmt-targetd-plugin ( =  1.10.1-4.el10)"

URI_libstoragemgmt-udev = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libstoragemgmt-udev-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt-udev = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libstoragemgmt-udev = "libstoragemgmt-udev ( =  1.10.1-4.el10) libstoragemgmt-udev(x86-64) ( =  1.10.1-4.el10)"

URI_python3-libstoragemgmt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-libstoragemgmt-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libstoragemgmt = "rtld(GNU_HASH) ( ) libglib-2.0.so.0()(64bit) ( ) /usr/bin/python3 ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libudev.so.1()(64bit) ( ) python3-six ( ) libled.so.1()(64bit) ( ) libsgutils2-1.48.so.2()(64bit) ( ) libstoragemgmt.so.1()(64bit) ( ) python(abi) ( =  3.12) libstoragemgmt(x86-64) ( =  1.10.1-4.el10)"
RPROVIDES:python3-libstoragemgmt = "python2-libstoragemgmt-clibs ( <=  1.9.0-1) python3-libstoragemgmt-clibs ( <=  1.9.0-1) config(python3-libstoragemgmt) ( =  1.10.1-4.el10) python-libstoragemgmt ( =  1.10.1-4.el10) python3-libstoragemgmt ( =  1.10.1-4.el10) python3-libstoragemgmt(x86-64) ( =  1.10.1-4.el10) python3.12-libstoragemgmt ( =  1.10.1-4.el10)"

URI_libstoragemgmt-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libstoragemgmt-devel-1.10.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libstoragemgmt-devel = "/usr/bin/pkg-config ( ) libstoragemgmt.so.1()(64bit) ( ) libstoragemgmt(x86-64) ( =  1.10.1-4.el10)"
RPROVIDES:libstoragemgmt-devel = "libstoragemgmt-devel ( =  1.10.1-4.el10) libstoragemgmt-devel(x86-64) ( =  1.10.1-4.el10) pkgconfig(libstoragemgmt) ( =  1.10.1)"
