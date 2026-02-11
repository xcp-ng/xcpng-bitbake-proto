
PN = "python-systemd"
PE = "0"
PV = "235"
PR = "11.el10"
PACKAGES = "python3-systemd python-systemd-doc"


URI_python3-systemd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-systemd-235-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-systemd = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_233)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_227)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_214)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_219)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_229)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_230)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_245)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_246)(64bit) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-systemd = "python-systemd ( =  235-11.el10) python3-systemd ( =  235-11.el10) python3-systemd(x86-64) ( =  235-11.el10) python3.12-systemd ( =  235-11.el10) python3.12dist(systemd-python) ( =  235) python3dist(systemd-python) ( =  235) systemd-python3 ( =  235-11.el10) systemd-python3(x86-64) ( =  235-11.el10)"

URI_python-systemd-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-systemd-doc-235-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python-systemd-doc = "js-jquery ( )"
RPROVIDES:python-systemd-doc = "python-systemd-doc ( =  235-11.el10) python-systemd-doc(x86-64) ( =  235-11.el10)"
