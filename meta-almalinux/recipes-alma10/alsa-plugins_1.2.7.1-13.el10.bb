
PN = "alsa-plugins"
PE = "0"
PV = "1.2.7.1"
PR = "13.el10"
PACKAGES = "alsa-plugins-arcamav alsa-plugins-maemo alsa-plugins-oss alsa-plugins-pulseaudio alsa-plugins-samplerate alsa-plugins-speex alsa-plugins-upmix alsa-plugins-usbstream alsa-plugins-vdownmix"


URI_alsa-plugins-arcamav = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-arcamav-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-arcamav = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( )"
RPROVIDES:alsa-plugins-arcamav = "libasound_module_ctl_arcam_av.so()(64bit) ( ) alsa-plugins-arcamav ( =  1.2.7.1-13.el10) alsa-plugins-arcamav(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-arcamav) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-maemo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-maemo-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-maemo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libdbus-1.so.3()(64bit) ( ) libdbus-1.so.3(LIBDBUS_1_3)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( )"
RPROVIDES:alsa-plugins-maemo = "libasound_module_ctl_dsp_ctl.so()(64bit) ( ) libasound_module_pcm_alsa_dsp.so()(64bit) ( ) alsa-plugins-maemo ( =  1.2.7.1-13.el10) alsa-plugins-maemo(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-maemo) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-oss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-oss-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-oss = "rtld(GNU_HASH) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libc.so.6(GLIBC_2.7)(64bit) ( )"
RPROVIDES:alsa-plugins-oss = "libasound_module_ctl_oss.so()(64bit) ( ) libasound_module_pcm_oss.so()(64bit) ( ) alsa-plugins-oss ( =  1.2.7.1-13.el10) alsa-plugins-oss(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-oss) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-pulseaudio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-pulseaudio-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-pulseaudio = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libpulse.so.0()(64bit) ( ) libasound.so.2(ALSA_0.9.0rc4)(64bit) ( ) libpulse.so.0(PULSE_0)(64bit) ( )"
RPROVIDES:alsa-plugins-pulseaudio = "libasound_module_conf_pulse.so()(64bit) ( ) libasound_module_ctl_pulse.so()(64bit) ( ) libasound_module_pcm_pulse.so()(64bit) ( ) alsa-plugins-pulseaudio ( =  1.2.7.1-13.el10) alsa-plugins-pulseaudio(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-pulseaudio) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-samplerate = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-samplerate-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-samplerate = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libsamplerate.so.0()(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) ( ) libsamplerate.so.0(libsamplerate.so.0.1)(64bit) ( )"
RPROVIDES:alsa-plugins-samplerate = "libasound_module_rate_samplerate.so()(64bit) ( ) alsa-plugins-samplerate ( =  1.2.7.1-13.el10) alsa-plugins-samplerate(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-samplerate) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-speex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-speex-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-speex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( ) libspeexdsp.so.1()(64bit) ( ) speex ( ) speexdsp ( )"
RPROVIDES:alsa-plugins-speex = "libasound_module_pcm_speex.so()(64bit) ( ) libasound_module_rate_speexrate.so()(64bit) ( ) alsa-plugins-speex ( =  1.2.7.1-13.el10) alsa-plugins-speex(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-speex) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-upmix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-upmix-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-upmix = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( )"
RPROVIDES:alsa-plugins-upmix = "libasound_module_pcm_upmix.so()(64bit) ( ) alsa-plugins-upmix ( =  1.2.7.1-13.el10) alsa-plugins-upmix(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-upmix) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-usbstream = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-usbstream-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-usbstream = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( )"
RPROVIDES:alsa-plugins-usbstream = "libasound_module_pcm_usb_stream.so()(64bit) ( ) alsa-plugins-usbstream ( =  1.2.7.1-13.el10) alsa-plugins-usbstream(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-usbstream) ( =  1.2.7.1-13.el10)"

URI_alsa-plugins-vdownmix = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/alsa-plugins-vdownmix-1.2.7.1-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:alsa-plugins-vdownmix = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libasound.so.2()(64bit) ( ) libasound.so.2(ALSA_0.9)(64bit) ( )"
RPROVIDES:alsa-plugins-vdownmix = "libasound_module_pcm_vdownmix.so()(64bit) ( ) alsa-plugins-vdownmix ( =  1.2.7.1-13.el10) alsa-plugins-vdownmix(x86-64) ( =  1.2.7.1-13.el10) config(alsa-plugins-vdownmix) ( =  1.2.7.1-13.el10)"
