
PN = "cockpit-session-recording"
PE = "0"
PV = "17"
PR = "1.el10"
PACKAGES = "cockpit-session-recording"


URI_cockpit-session-recording = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cockpit-session-recording-17-1.el10.noarch.rpm;unpack=0"
RDEPENDS:cockpit-session-recording = "tlog ( ) cockpit-system ( ) sssd-proxy ( )"
RPROVIDES:cockpit-session-recording = "metainfo() ( ) metainfo(org.cockpit-project.session-recording.metainfo.xml) ( ) bundled(npm(lodash)) ( =  4.17.21) bundled(npm(prop-types)) ( =  15.8.1) bundled(npm(js-tokens)) ( =  4.0.0) bundled(npm(loose-envify)) ( =  1.4.0) bundled(npm(object-assign)) ( =  4.1.1) bundled(npm(react-is)) ( =  16.13.1) bundled(npm(tabbable)) ( =  6.2.0) bundled(npm(date-fns)) ( =  2.30.0) bundled(npm(react)) ( =  18.2.0) bundled(npm(react-dom)) ( =  18.2.0) bundled(npm(react-dropzone)) ( =  14.2.3) bundled(npm(core-util-is)) ( =  1.0.3) bundled(npm(@babel/runtime)) ( =  7.23.9) bundled(npm(@patternfly/patternfly)) ( =  5.2.0) bundled(npm(@patternfly/react-core)) ( =  5.2.0) bundled(npm(@patternfly/react-icons)) ( =  5.2.0) bundled(npm(@patternfly/react-styles)) ( =  5.2.0) bundled(npm(@patternfly/react-table)) ( =  5.2.0) bundled(npm(@patternfly/react-tokens)) ( =  5.2.0) bundled(npm(array-timsort)) ( =  1.0.3) bundled(npm(attr-accept)) ( =  2.2.2) bundled(npm(base64-js)) ( =  1.5.1) bundled(npm(buffer)) ( =  6.0.3) bundled(npm(comment-json)) ( =  4.2.3) bundled(npm(esprima)) ( =  4.0.1) bundled(npm(file-selector)) ( =  0.6.0) bundled(npm(focus-trap)) ( =  7.5.2) bundled(npm(has-own-prop)) ( =  2.0.0) bundled(npm(ieee754)) ( =  1.2.1) bundled(npm(ini)) ( =  4.1.1) bundled(npm(jquery)) ( =  3.7.1) bundled(npm(regenerator-runtime)) ( =  0.14.1) bundled(npm(repeat-string)) ( =  1.6.1) bundled(npm(scheduler)) ( =  0.23.0) bundled(npm(throttle-debounce)) ( =  5.0.0) bundled(npm(tslib)) ( =  2.6.2) bundled(npm(xterm)) ( =  5.1.0) bundled(npm(xterm-addon-canvas)) ( =  0.4.0) cockpit-session-recording ( =  17-1.el10)"
