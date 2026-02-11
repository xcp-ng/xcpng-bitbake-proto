
PN = "mpich"
PE = "0"
PV = "4.1.2"
PR = "15.el10"
PACKAGES = "mpich mpich-autoload mpich-devel mpich-doc python3-mpich"


URI_mpich = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpich = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/perl ( ) libstdc++.so.6(CXXABI_1.3.8)(64bit) ( ) libgfortran.so.5()(64bit) ( ) libgfortran.so.5(GFORTRAN_8)(64bit) ( ) libhwloc.so.15()(64bit) ( ) environment(modules) ( ) libfabric.so.1()(64bit) ( ) libfabric.so.1(FABRIC_1.0)(64bit) ( ) libfabric.so.1(FABRIC_1.1)(64bit) ( ) libfabric.so.1(FABRIC_1.7)(64bit) ( ) libgfortran.so.5(GFORTRAN_9)(64bit) ( ) python(abi) ( if  python3)"
RPROVIDES:mpich = "mpi ( ) libmpi.so.12()(64bit)(mpich-x86_64) ( ) libmpicxx.so.12()(64bit)(mpich-x86_64) ( ) libmpifort.so.12()(64bit)(mpich-x86_64) ( ) mpich ( =  4.1.2-15.el10) bundled(yaksa) ( =  0.2) mpich(x86-64) ( =  4.1.2-15.el10) mpich2 ( =  4.1.2)"

URI_mpich-autoload = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-autoload-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpich-autoload = "mpich ( =  4.1.2-15.el10)"
RPROVIDES:mpich-autoload = "mpich-autoload ( =  4.1.2-15.el10) mpich-autoload(x86-64) ( =  4.1.2-15.el10) mpich2-autoload ( =  3.0.1)"

URI_mpich-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-devel-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mpich-devel = "/usr/bin/bash ( ) pkgconfig ( ) redhat-rpm-config ( ) gcc-gfortran ( ) rpm-mpi-hooks ( ) mpich ( =  4.1.2-15.el10)"
RPROVIDES:mpich-devel = "rpm_macro(_mpich_load) ( ) rpm_macro(_mpich_unload) ( ) mpich-devel ( =  4.1.2-15.el10) mpich-devel(x86-64) ( =  4.1.2-15.el10) mpich-devel-static ( =  4.1.2-15.el10) mpich2-devel ( =  3.0.1)"

URI_mpich-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mpich-doc-4.1.2-15.el10.noarch.rpm;unpack=0"
RDEPENDS:mpich-doc = "mpich-devel ( =  4.1.2-15.el10)"
RPROVIDES:mpich-doc = "mpich-doc ( =  4.1.2-15.el10) mpich2-doc ( =  3.0.1)"

URI_python3-mpich = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-mpich-4.1.2-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-mpich = "python(abi) ( =  3.12) mpich ( =  4.1.2-15.el10)"
RPROVIDES:python3-mpich = "python-mpich ( =  4.1.2-15.el10) python3-mpich ( =  4.1.2-15.el10) python3-mpich(x86-64) ( =  4.1.2-15.el10) python3.12-mpich ( =  4.1.2-15.el10)"
