
PN = "sblim-cmpi-base"
PE = "0"
PV = "1.6.4"
PR = "29.el10"
PACKAGES = "sblim-cmpi-base sblim-cmpi-base-devel"


URI_sblim-cmpi-base = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-cmpi-base-1.6.4-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-cmpi-base = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) /sbin/ldconfig ( ) cim-server ( ) sblim-indication_helper ( ) libind_helper.so.0()(64bit) ( )"
RPROVIDES:sblim-cmpi-base = "libcmpiOSBase_BaseBoardProvider.so()(64bit) ( ) libcmpiOSBase_CSBaseBoardProvider.so()(64bit) ( ) libcmpiOSBase_CSProcessorProvider.so()(64bit) ( ) libcmpiOSBase_Common.so.0()(64bit) ( ) libcmpiOSBase_ComputerSystemProvider.so()(64bit) ( ) libcmpiOSBase_OSProcessProvider.so()(64bit) ( ) libcmpiOSBase_OperatingSystemProvider.so()(64bit) ( ) libcmpiOSBase_OperatingSystemStatisticalDataProvider.so()(64bit) ( ) libcmpiOSBase_OperatingSystemStatisticsProvider.so()(64bit) ( ) libcmpiOSBase_ProcessorProvider.so()(64bit) ( ) libcmpiOSBase_RunningOSProvider.so()(64bit) ( ) libcmpiOSBase_UnixProcessProvider.so()(64bit) ( ) libdmiinfo.so.0()(64bit) ( ) sblim-cmpi-base ( =  1.6.4-29.el10) sblim-cmpi-base(x86-64) ( =  1.6.4-29.el10)"

URI_sblim-cmpi-base-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-cmpi-base-devel-1.6.4-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-cmpi-base-devel = "libcmpiOSBase_Common.so.0()(64bit) ( ) libdmiinfo.so.0()(64bit) ( ) sblim-cmpi-base ( =  1.6.4-29.el10)"
RPROVIDES:sblim-cmpi-base-devel = "sblim-cmpi-base-devel ( =  1.6.4-29.el10) sblim-cmpi-base-devel(x86-64) ( =  1.6.4-29.el10)"
